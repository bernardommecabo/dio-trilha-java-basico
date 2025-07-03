public class Iphone implements MusicPlayer, Phone, InternetBrowser {
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving a call...");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending a message...");
    }

    @Override
    public void openPage() {
        System.out.println("Opening a web page...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing the web page...");
    }

    @Override
    public void addBookmark() {
        System.out.println("Adding a bookmark...");
    }
}
