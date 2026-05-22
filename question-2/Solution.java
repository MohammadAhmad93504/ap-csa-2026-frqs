public class Bottle {
    private double maxVolume; 
    private double currentVolume; 

    public Bottle(double totalCapacity) {
        maxVolume = totalCapacity; 
        currentVolume = maxVolume; 
    }

    public double updateAmount(double amountChanged) {
        currentVolume = currentVolume - amountChanged; 
        
        double quarterMark = maxVolume * 0.25;
        if (currentVolume < quarterMark) {
            currentVolume = maxVolume; 
        }
        
        return currentVolume; 
    }
}
