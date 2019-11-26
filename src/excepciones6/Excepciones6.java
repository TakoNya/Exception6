package excepciones6;

public class Excepciones6 {

        public static void main(String[] args) {
        //Fijate que el arreglo nums es más grande que el arreglo denom
        int nums[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};
        for (int i = 0; i< nums.length; i++){
            try{
                System.out.println(nums[i] + " / " + denom[i] + " es " + nums[i]/denom[i]);
            } catch (ArrayIndexOutOfBoundsException exc){
                //Capturando primero la excepción más específica
                System.out.println("No se encontró ningún elemento.");
            }
            catch(Exception exc){
                //capturando luego dla excepción más general
                System.out.println("Alguna excepción ocurrió.");
            }
        }
    }
    
}
