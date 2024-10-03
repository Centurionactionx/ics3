public class calculate {
    
    // Calculates the length given the harmonic number and the wavelength
    public double calculate_length(int hNum, double wLength){ 
        double len = hNum*wLength/2;
        return len;
    }

    // Calculates the harmonic number given the length and wavelength
    public int calculate_harmonic(double len, double wLength){
        int harmonic_num = (int)(2*len/wLength);
        return harmonic_num;
    }

    // Calculates the wavelength given the harmonic number and length
    public double calculate_wavelength(int hNum, double len){
        double wavelength = 2*len/hNum;
        return wavelength;
    }
}
