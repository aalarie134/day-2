public class mover {
    private int horizontal;
    private int depth;
    mover(){
         depth = 0;
         horizontal= 0;
    }

    public void move( String way , int distance){


        switch(way){

            case "forward":
                horizontal = horizontal + distance;
                break;
            case "up":
                depth = depth - distance;
            case "down":
                depth = depth + distance;
        }

    }

    public int getDepth() {
        return depth;
    }

    public int getHorizontal() {
        return horizontal;
    }
}
