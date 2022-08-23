package Odevler.Gun34Odevler.soru3;

public class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    private memberShip whichMember;

    public Subscribe() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        if (!doYouWanaSubscribe){
            System.out.println("See you when you want to be a member. Thanks");
        }
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }
    public memberShip getWhichMember() {
        return whichMember;
    }
    public void setWhichMember(memberShip whichMember) {
        if (doYouWanaSubscribe) {
            if (whichMember == memberShip.GOLD) {
                System.out.println("Welcome to membership " + name + ".Your membership is 40 dollar \n" +
                        "for month you can enjoy the videos , all homework and see you soon.");
            } else if (whichMember == memberShip.SILVER) {
                System.out.println("Welcome to membership " + name + ".Your membership is 20 dollar \n" +
                        "for month you can enjoy the videos and all homework.");
            } else if (whichMember == memberShip.BRONZE) {
                System.out.println("Welcome to membership " + name + ".Your membership is 10 dollar \n" +
                        "for month you can enjoy the videos.");
            }
            this.whichMember = whichMember;
        }
    }

    @Override
    public String toString() {
        return "Name is "+name+" ,do you wanna subs ? = "+doYouWanaSubscribe+" which member="+getWhichMember();
    }
}
