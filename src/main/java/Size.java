public enum Size {
    SMALL( "S or SMALL" , 11, 40), MEDIUM("M or MEDIUM", 30, 70),
    LARGE("L or LARGE", 50, 100),  EXTRA_LARGE("XL or EXTRA LARGE", 100, 150);
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
        return name+" size: "+"width = "+ width+", "+"length = "+ length;
    }
}

