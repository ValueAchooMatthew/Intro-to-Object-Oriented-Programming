/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (40 marks)
    Use java to implement a TV that has many normal functions such as turn on and off, set channels and set volumes, etc.
    Requirements:
    * 1. The channel of a TV is no smaller than 1, and no greater than 120.
    * 2. The volume of a TV is no smaller than 1 and no greater than 7.
    * 3. One should not be able to change channel or volume when the TV is off.
 */

public class Q1_JavaTV {
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // If on = true, then TV is on. Otherwise, TV is off. By default, TV is off when you get a new TV.

    public Q1_JavaTV() {
        System.out.println("Congrats! You get a new TV!");
    }

    // (5 marks)
    public void turnOn() {
        System.out.println("Turn on tv.");
        /* place your code here */
        on = true;

    }

    // (5 marks)
    public void turnOff() {
        System.out.println("Turn off tv.");
        /* place your code here */
        on = false;
    }

    // (5 marks)
    public void setChannel(int newChannel) {
        /* place your code here */

        if(!on){
            System.out.println("The TV is off! Please turn on the TV to change the channel");

        }else{
            if(newChannel < 1 || newChannel > 120){
                System.out.println("The inputted channel must be between 1 and 120");
            }else{
                System.out.println("Set Channel to: " + newChannel + ".");
                channel = newChannel;
            }

        }

    }

    // (5 marks)
    public void setVolume(int newVolumeLevel) {
        if(!on){
            System.out.println("The TV is off! Please turn on the TV to change the volume");

        }else{
            if(newVolumeLevel < 1 || newVolumeLevel > 7){
                System.out.println("The inputted volume must be between 1 and 7");
            }else{
                System.out.println("Set volume to: " + newVolumeLevel + ".");
                volumeLevel = newVolumeLevel;
            }

        }
    }

    // (5 marks)
    public void channelUp() {
        /* place your code here */
        System.out.println("Channel Up.");
        if(channel >= 120){
            System.out.println("You cannot increase the channel past channel 120!");
        }else{
            channel++;
        }
    }

    // (5 marks)
    public void channelDown() {
        System.out.println("Channel Down.");
        /* place your code here */
        if(channel <=1){
            System.out.println("You cannot increase the channel past channel 120!");
        }else{
            channel--;
        }
    }

    // (5 marks)
    public void volumeUp() {
        System.out.println("Volume Up.");
        /* place your code here */
        if(volumeLevel >=7){
            System.out.println("You cannot increase the volume past 7!");
        }else{
            volumeLevel++;
        }
    }

    // (5 marks)
    public void volumeDown() {
        System.out.println("Volume Down.");
        /* place your code here */
        if(volumeLevel <=1){
            System.out.println("You cannot decrease the volume past 1!");
        }else{
            volumeLevel--;
        }
    }

    public String getTVStatus() {
        String status= "";

        if (on==true) {
            status += "Power is On  \t|\t";
            status += "Channel is: " + channel + "\t|\t";
            status += "Volume is: " + volumeLevel + "\t";
        } else{
            status += "Power is Off";
            return status;
        }

        return status;
    }

    public static void main(String arg[]) {
        /* TA may test different functions of the TV here */
        /* The following is just an example of how to test the TV's functions. */
        Q1_JavaTV my_tv = new Q1_JavaTV();
        System.out.println(my_tv.getTVStatus());
        my_tv.turnOn();
        System.out.println(my_tv.getTVStatus());
        my_tv.channelUp();
        System.out.println(my_tv.getTVStatus());
        my_tv.volumeUp();
        System.out.println(my_tv.getTVStatus());
    }
}
