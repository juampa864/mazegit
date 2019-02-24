/*
    Esta es su clase principal. El unico metodo que debe implementar es
    public String[] solve(Maze maze)
    pero es libre de crear otros metodos y clases en este u otro archivo que desee.
*/
    import java.util.*;


    public class Solver{
    String rastro;
    public Solver(){
        
    }

    public String[] solve(Maze maze){
        Maze finalspace = maze;
        int moves = finalspace.getMaxMoves();
        ArrayList<String> solutions  = new ArrayList<String>();
        

        int i = 0;
        while(i<moves){
            int start = finalspace.getStartSpace();
            int exit = finalspace.getExitSpace();

            rastro = "";
            rastro = rastro.concat("[" + start + ", ");
            solutions.add(this.move(start, exit, finalspace));
            i++;
        }
        int size = solutions.size();
        String [] soluciones = new String[size];
        i=0;
        while(i<size){
            soluciones[i] = solutions.get(i);
            i++;
        }
        return soluciones;

    }

    public boolean base(int start, int exit, Maze maze){
        int n = maze.moveNorth(start);
        int s = maze.moveSouth(start);
        int e = maze.moveEast(start);
        int w = maze.moveWest(start);

        if ((n == exit) || (s == exit) || (e == exit) || (w == exit)) return true;
        else return false;
    }


    public String move(int start, int exit, Maze maze){
        if (!(base(start, exit, maze))){

            if(maze.moveNorth(start) != start){ 
                start = maze.moveNorth(start);
                rastro = rastro.concat(start + ", ");
            else if (maze.moveSouth(start) != start){
                start = maze.moveNorth(start);
                rastro = rastro.concat(start + ", ");
            }
            }
            else if (maze.moveEast(start) != start){
                start = maze.moveEast(start);
                rastro = rastro.concat(start + ", ");
            }
            else if (maze.moveWest(start) != start){
                start = maze.moveWest(start);
               rastro = rastro.concat(start + ", ");
            }
            this.move(start, exit, maze);
        }
        else {
            rastro = rastro.concat(exit+"]");
            return rastro;
        }
        return rastro;
    }

}//final