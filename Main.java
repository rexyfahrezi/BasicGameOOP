package SimpleGame;
/**
* @author Rexy
*/
public class Main {
 public static void main(String[] args){
 Player player1 = new Player();
 Player player2 = new Player("Fahrezi",100);
 
 player1.setNama("Rexy");
 player1.setPower(150);
 
 System.out.println("============= Player 1 Stats =============");
 System.out.println("Nama :"+player1.getNama());
 System.out.println("Power :"+player1.getPower());
 System.out.println("Gold :"+player1.getGold()+"\n");
 player1.attack(5);
 System.out.println("Sisa Power :"+player1.getPower());
 System.out.println("Total Gold :"+player1.getGold()+"\n");
 System.out.println("============= Player 2 Stats =============");
 System.out.println("Nama :"+player2.getNama());
 System.out.println("Power :"+player2.getPower());
 System.out.println("Gold :"+player2.getGold()+"\n");
 player2.attack(11);
 System.out.println("Sisa Power :"+player2.getPower());
 System.out.println("Total Gold :"+player2.getGold()+"\n");
 player2.rest(10);
 System.out.println("Sisa Power :"+player2.getPower());
 System.out.println("Total Gold :"+player2.getGold()+"\n");
 player2.attack(11);
 System.out.println("Sisa Power :"+player2.getPower());
 System.out.println("Total Gold :"+player2.getGold()+"\n");
 }
}
