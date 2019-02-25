    import java.util.*;


    public class Solver{

    public Solver(){}

    public String[] solve(Maze finalspace){
        int moves = finalspace.getMaxMoves();
        int start = finalspace.getStartSpace();
        int exit = finalspace.getExitSpace();
        ArrayList<String> solutions  = new ArrayList<String>();

        this.move(start, exit, 0, finalspace, solutions, "");

        int size = solutions.size();
        String [] soluciones = new String[size];
        int i=0;
        while(i<size){
            soluciones[i] = solutions.get(i);
            i++;
        }
        return soluciones;

    }

    public boolean base(int start, int exit, ArrayList<String> solutions, String rastro){
        if (start==exit) {
            solutions.add("["+rastro+exit+"]");
            return true;
        }
        else return false;
    }


    public void move(int start, int exit, int moves, Maze finalspace, ArrayList<String> solutions, String rastro){
        boolean aux = true;
        if(!(base(start, exit, solutions, rastro))&&moves<finalspace.getMaxMoves()){
            if(finalspace.moveNorth(start) != start){ 
                rastro = rastro.concat(start + ", ");
                aux = false;
                moves++;
                move(finalspace.moveNorth(start), exit, moves, finalspace, solutions, rastro);
            }
            if (finalspace.moveSouth(start) != start){
                if(aux) {
                    rastro = rastro.concat(start + ", ");
                    aux = false;
                    moves++;
                }
                move(finalspace.moveSouth(start), exit, moves, finalspace, solutions, rastro);
            }
            if (finalspace.moveEast(start) != start){
                if(aux) {
                    rastro = rastro.concat(start + ", ");
                    aux = false;
                    moves++;
                }
                move(finalspace.moveEast(start), exit, moves, finalspace, solutions, rastro);
            }
            if (finalspace.moveWest(start) != start){
                if(aux) {
                    rastro = rastro.concat(start + ", ");
                    aux = false;
                    moves++;
                }
                move(finalspace.moveWest(start), exit, moves, finalspace, solutions, rastro);
            }
        }
    }

}//final

