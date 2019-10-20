package SimpleGame;
/**
* @author Rexy
*/
public class Player {
 String nama;
 int power,gold;
 public Player(){
 nama = "";
 power = 0;
 gold = 0;
 }
 public Player(String nama, int power){
 this.nama = nama;
 this.power = power;
 }
 public String getNama() {
 return nama;
 }
 public void setNama(String nama) {
 this.nama = nama;
 }
 public int getPower() {
 return power;
 }
 public void setPower(int power) {
 this.power = power;
 }
 public int getGold() {
 return gold;
 }
 public void setGold(int gold) {
 this.gold = gold;
 }
 
 public void attack(int attacking) {
 int energi = 0;
 energi = attacking * 10;
 
 System.out.println("Anda berusaha menyerang sebanyak "+attacking+" kali dan 
membutuhkan power sebesar "+energi+"!");
 
 if (this.power - (attacking * 10) >= 0){
 this.power = this.power - (attacking * 10);
 this.gold = this.gold + (attacking * 100);
 int uang = this.gold;
 System.out.println("Sukses menyerang! anda mendapatkan "+uang+" gold");
 }
 else {
 System.out.println("Gagal menyerang karna power anda kurang, gunakan 
fitur rest untuk menambah power!");
 }
 }
 
 public void rest(int resting){
 this.power = this.power + resting;
 System.out.println("Anda telah beristirahat selama "+resting+" menit dan 
berhasil memulihkan "+resting+" power!");
 }
}
