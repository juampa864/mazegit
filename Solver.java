/*
    Esta es su clase principal. El unico metodo que debe implementar es
    public String[] solve(Maze maze)
    pero es libre de crear otros metodos y clases en este u otro archivo que desee.
*/
public class Solver{

    public Solver(){
        //Sientase libre de implementar el contructor de la forma que usted lo desee
    }

    public String[] solve(Maze maze){
        int size = maze.getMaxMoves();
        int start = maze.getStartSpace();
        int exit = maze.getExitSpace();
        int movin = 0;
        int mv = start;

        while (mv!=exit){
            if (movin == size){
                break;
            }
            else {
                /* aqui vamos a ir recorriendo el laberinto, tenemos que estar concientes de la cantidada de movimientos 
                que nos quedan y así ver hacia donde podemos movernos.
                estaba pensando comparar con el valor del estado anterior para ver si se puede regresar o no
                esta bien hacer esto: 
                int mvn = maze.moveNorth(start) == start ? -1 : maze.moveNorth(start);
                int mvs = maze.moveSouth(start) == start ? -1 : maze.moveSouth(start);
                int mve = maze.moveEast(start) == start ? -1 : maze.moveEast(start);
                int mvo = maze.moveWest(start) == start ? -1 : maze.moveWest(start);
                pero tendría que ser mv no start.
                */
            }
        }

        




        String[] solutions = new String[size];
        int i = 0;
        while(i<size+1){
            solutions[i] = "[" + start;
            i ++;
        }
        return solutions;
    }

}