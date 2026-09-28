public class ElectronicsReport {
    public static void main(String[] args) {
        
        // 1D array for cities - this is for the single array requirement
        String[] cities = {"CAPE TOWN" , "PORT ELIZABETH" , "PRETORIA"};
        
        // 2D array for sales [3 cities] [3 consoles] - 0=PSS , 1=XBOX , 2=switch
        int[][] sales = {
            {1000,2000,3000}, // Cape Town
            {2000,3000,4000}, // Port Elizabeth
            {1500,1100,1200], // Pretoria
            
        };
        
        int[]totalPerCity = new int[3];
        int biggestSales = 0;
        String biggestCity = " ";
        
        // print header like sample
        System.out.println("----------------------------------------------------");
        System.out.println("GAUTENG CONSOLE REPORT")
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t\t PS5 \t\t XBOX \t\t SWITCH");
        
        // loop to show report and calculate totals
        for(int i = 0; i < 3; i++){
            System.out.print(cities[i] + "\t\t ");
            for(int j = 0 ; j < 3; j++){
                System.out.print(sales[i][j] + "\t\t ");
           }
           System.out.println();
           
           // calculate the total for this day
           totralPerCity[i] = sales[i][0] + sales[i][1] + sales[i][2];
           
           // check for max city
           if(totalPerCity[i] > biggestSales){
               biggestSales = totalPerCity[i];
               biggestCity = cities[i];
           }
        }
        
        System.out.println("---------------------------------------------------");
        System.out.println();
        System.out.println("CONSOLES SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------");
        
        for(int i = 0; i < 3; i++){
            System.out.println(cities[i] + "\t\t" + totalPerCity[i]);
        }
        
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + biggestCity);
        System.out.println("---------------------------------------------------");
       }
    }
           
           
        
    
        
        
    
}