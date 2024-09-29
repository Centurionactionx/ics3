import math

class PhysCalc:

    def __init__(self):
        self.energy = 0.0
        self.velocity = 0.0
        self.mass = 0.0

    def get_mass(self):
        self.mass = float(input("Enter the mass: "))

    def get_velocity(self):
        self.velocity = float(input("Enter the velocity: "))

    def get_energy(self):
        self.energy = float(input("Enter the energy: "))

    def kin_energy(self):
        self.energy = 0.5 * self.mass * self.velocity ** 2
        return self.energy

    def calc_velocity(self):
        self.velocity = math.sqrt((2 * self.energy) / self.mass)
        return self.velocity

    def calc_mass(self):
        self.mass = (2 * self.energy) / (self.velocity ** 2)
        return self.mass

    def calculate(self):
        print("Enter your selection")
        print("E -- Calculate Energy")
        print("m -- Calculate Mass")
        print("v -- Calculate Velocity")
        choice = input().strip().lower()

        if choice == 'e':
            self.get_mass()
            self.get_velocity()
            print(f"The kinetic energy is: {self.kin_energy():.2f}")
        elif choice == 'v':
            self.get_energy()
            self.get_mass()
            print(f"The velocity is: {self.calc_velocity():.2f}")
        elif choice == 'm':
            self.get_velocity()
            self.get_energy()
            print(f"The mass is: {self.calc_mass():.2f}")
        else:
            print("Invalid Menu option")

if __name__ == "__main__":
    p = PhysCalc()
    p.calculate()
