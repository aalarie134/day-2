public class mover {
    private int horizontal;
    private int depth;
    private int aim;
    mover(){
         depth = 0;
         horizontal= 0;
         aim = 0;
    }

    public void move( String way , int distance){


        switch(way){

            case "forward":
                horizontal = horizontal + distance;
                depth = depth + distance * aim;
                break;
            case "up":
                aim = aim - distance;
                break;
            case "down":
                aim = aim + distance;
                break;
        }

    }

    public int getDepth() {
        return depth;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getAim() {
        return aim;
    }
}
