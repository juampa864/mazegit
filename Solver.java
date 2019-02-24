/*
    Esta es su clase principal. El unico metodo que debe implementar es
    public String[] solve(Maze maze)
    pero es libre de crear otros metodos y clases en este u otro archivo que desee.
*/
public class Solver{

    public Solver(){
        
    }

    public String[] solve(Maze maze){
        Maze finalspace = maze;
        int moves = finalspace.getMaxMoves();
        int start = finalspace.getStartSpace();
        int exit = finalspace.getExitSpace();
        String rastro = "[";


    }

    public boolean base(int start, int exit, Maze maze){
        int n = maze.moveNorth(start);
        int s = maze.moveSouth(start);
        int e = maze.moveEast(start);
        int w = maze.moveWest(start);

        if ((n == exit) || (s == exit) || (e == exit) || (w == exit)) return true;
        else return false;
    }


    public void move(int start, int exit, Maze maze){
        if (!base(start, exit, maze)){
            this.rec();
        }
        else return;
    }

    public String rec(String rastro, int start, int exit, Maze, maze){
        int n = maze.moveNorth(start);
        int s = maze.moveSouth(start);
        int e = maze.moveEast(start);
        int w = maze.moveWest(start);

        if (n!=-1){
            this.move(start, exit, maze);
        }
    }

}//final