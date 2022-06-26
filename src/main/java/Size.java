public enum Size {
    SMALL( "S" , 11, 40), MEDIUM("M", 30, 70),
    LARGE("L", 50, 100),  EXTRA_LARGE("XL", 100, 150);
    private String name;
    private int width, length;


    Size(String name, int width, int length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    public String toString(){
        return getName()+ " or " + super.toString() + " size: " + " width =  " + getWidth() + " length = "+ getLength();

    }
}

