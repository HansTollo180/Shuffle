public class ShuffleWorkout {

    /**
     * @param array
     */
    public static void shuffle(Object[] array) {
        int noOfElements = array.length;
        
        for (int i = 0; i < noOfElements; i++){
            int s = i + (int)(Math.random() * (noOfElements - i));

            Object temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }

    // This is shuffle array of workout for me because am bored of following same workout routine

    public static void main(String[] args) {
        // Using two seperate array 
        // NOTE: Was using 2 arrays but couldnt make it
        
        String[] workout = {"Chest Day","Leg Day", "Shoulders", "Back Day", "Arm Day", "Rest Day", "Rest Day"};

        ShuffleWorkout.shuffle(workout);
            
        for(int i = 0; i < workout.length; i++){
            System.out.print(workout[i] + "|") ;

        }
    
    }
}
