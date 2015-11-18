import java.util.Scanner;


class Saving {
    
    private String item;
    private int event_date;
    private double cash;
    private String category;
    
    
    public String getItem(){
        
        return item;
    }
    public void setItem(String item){
        this.item = item;
        System.out.print("Item :");
        
    }
    
    public int getEventDate(){
       return event_date;
    }
    public void setEventDate(int event_date){
    
        this.event_date = event_date;
    }
    
    public double getCash(){
      System.out.print("Cash :"+cash);  
      return cash;
    }
    public void setCash(double cash){
    
        this.cash = cash;
    }
    
    public String getCategory(){
      return category;
    }
    public void setCash(String categoryh){
    
        this.category = category;
    }
    
   public static void Menu(){
        Saving s = new Saving();
        Scanner sc = new Scanner(System.in);
        String item = null;
        s.setItem(item);
        item = sc.nextLine();
       
        s.getItem();
        System.out.print("Cash :");
        int cash = sc.nextInt();
        
       System.out.println("Category (1:Food, 2:Drink 3:Entertain 4:Energy 5:Sneck 10:Monthly 11:Part Time 12:Other)");
       System.out.print("Select :");
       int select = sc.nextInt();
        
        
                  }
        
   
   public  static void MenuIcon(){
        System.out.println("--------------------------------");
        System.out.println("MAIN");
        System.out.println("--------------------------------");
        System.out.println("1) ADD");
        System.out.println("2) Delete");
        System.out.println("3) Update");        
        System.out.println("4) Display");
        System.out.println("q) Eixt");
    }

   

   public static void main(String[] args){
       Saving s =new Saving();
       Scanner sc = new Scanner(System.in);
       MenuIcon();
          
        System.out.print("Select : ");
        int select = sc.nextInt();
        switch(select){
            case 1: System.out.println("------------------------");
                    System.out.println("ADD");
                    System.out.println("------------------------");
                    Menu();
                    s.getItem();break;
                
            case 4: System.out.println("--------------------------------------------");
                    System.out.println("Date     ITEM            CASE       CATEGORY");
                    System.out.println("--------------------------------------------");
                   
                    s.getItem();
                   
                
        }
   }}
