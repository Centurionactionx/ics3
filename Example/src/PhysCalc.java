import java.util.Scanner;

public class PhysCalc {

  Scanner s;
  double energy;
  double velocity;
  double mass;

  PhysCalc() {
    s = new Scanner(System.in);
  }

  public void getMass() {
    System.out.print("Enter the mass: ");
    mass = s.nextDouble();
    s.nextLine();
  }

  public void getVelocity() {
    System.out.print("Enter the velocity: ");
    velocity = s.nextDouble();
    s.nextLine();
  }

  public void getEnergy() {
    System.out.print("Enter the energy: ");
    energy = s.nextDouble();
    s.nextLine();
  }

  public double kinEnergy() {
    energy = 0.5 * mass * velocity * velocity;
    return energy;
  }

  public double velocity() {
    velocity = Math.sqrt((2 * energy) / mass);
    return velocity;
  }

  public double mass() {
    mass = (2 * energy) / (velocity * velocity);
    return mass;
  }

  public void calculate() {
    char choice;
    System.out.println("Enter your selection");
    System.out.println("E -- Calculate Energy");
    System.out.println("m -- Calculate Mass");
    System.out.println("v -- Calculate Velocity");
    choice = s.nextLine().charAt(0);

    switch (choice) {
      case 'e':
      case 'E':
        getMass();
        getEnergy();

        System.out.printf("The kinetic energy is: %.2f", kinEnergy());
        break;

      case 'v':
      case 'V':
        getEnergy();
        getMass();

        System.out.printf("The velocity is: %.2f", velocity());
        break;

      case 'm':
      case 'M':
        getVelocity();
        getEnergy();

        System.out.printf("The mass is: %.2f", mass());
        break;

      default:
        System.out.println("Invalid Menu option");
        break;
    }

  }

  public static void main(String[] args) {
    PhysCalc p = new PhysCalc();
    p.calculate();
  }
}