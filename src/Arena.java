public class Arena {


    public void showArena(Object array[]) {
        System.out.println(" " + array[0] + " | " + array[1] + " | " + array[2]);
        System.out.println("------------");
        System.out.println(" " + array[3] + " | " + array[4] + " | " + array[5]);
        System.out.println("------------");
        System.out.println(" " + array[6] + " | " + array[7] + " | " + array[8]);
    }

    public void correct_Turn(Object[] array, int number, int process) {

        if ((process % 2 == 0)) {
            array[number - 1] = "o";
        }
        if(process%2!=0){
            array[number - 1] = "x";
        }
    }
    public boolean result(Object[] array,Player player1,Player player2){
        if((array[0]=="x")&&(array[1]=="x")&&(array[2]=="x")){
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[3]=="x")&&(array[4]=="x")&&(array[5]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[6]=="x")&&(array[7]=="x")&&(array[8]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[0]=="x")&&(array[3]=="x")&&(array[6]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[1]=="x")&&(array[4]=="x")&&(array[7]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[2]=="x")&&(array[5]=="x")&&(array[8]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[0]=="x")&&(array[4]=="x")&&(array[8]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[2]=="x")&&(array[4]=="x")&&(array[6]=="x")) {
            System.out.println(player1.name+" wins");
            return true;
        }
        else if ((array[0]=="o")&&(array[1]=="o")&&(array[2]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[3]=="o")&&(array[4]=="o")&&(array[5]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[6]=="o")&&(array[7]=="o")&&(array[8]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[0]=="o")&&(array[3]=="o")&&(array[6]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[1]=="o")&&(array[4]=="o")&&(array[7]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[2]=="o")&&(array[5]=="o")&&(array[8]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[0]=="o")&&(array[4]=="o")&&(array[8]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[2]=="o")&&(array[4]=="o")&&(array[6]=="o")) {
            System.out.println(player2.name+" wins");
            return true;
        }
        else if ((array[0]!=" ")&&(array[1]!=" ")&&(array[2]!=" ")&&(array[3]!=" ")&&(array[4]!=" ")&&(array[5]!=" ")&&(array[6]!=" ")&&(array[7]!=" ")&&(array[8]!=" ")) {
            System.out.println("Draw");
            return true;
        }
        else {
            return false;
        }


    }




    public void createArena(Object array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = " ";
        }
    }
}


