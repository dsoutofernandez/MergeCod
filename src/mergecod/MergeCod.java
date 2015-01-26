package mergecod;

public class MergeCod {

    public static void main(String[] args) {
        
        int numeros[]=new int[5];
        int aux;
        
        for (int i = 0; i<numeros.length -1; i++){
        
            numeros[i]=(int) (Math.random()*50)+1;
        
        }
        
       for (int i = 0; i< numeros.length-1; i++){

                    for(int j = i+1; j<numeros.length; j++){

                        if (numeros[i] < numeros[j]){

                            aux = numeros[i];
                            numeros[i] = numeros[j];
                            numeros[j] = aux;
                    }

                }

            }
        
        for(int i = 0; i<numeros.length -1;i++){
            System.out.println(numeros[i]);
        }
        
        System.out.println("Commit 2");
        
    }
    
}
    
}
