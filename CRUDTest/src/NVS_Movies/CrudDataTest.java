/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NVS_Movies;

/**
 *
 * @author user
 */
public class CrudDataTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          MainP ld = new MainP();
        ld.setVisible(true);
        
        HomePage hp = new HomePage();
        hp.setVisible(false);
        
        try{
            for (int x=0;x<=100;x++){
            Thread.sleep(110);
            ld.hala.setText(Integer.toString(x)+"%");
            ld.hato.setValue(x);
            
            if(x==100){
                ld.dispose();
            hp.show();
            }
            }
        
        }catch (Exception e){
        }
    }
}

    
    

