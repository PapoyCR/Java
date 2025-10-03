class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
  double FtoC(double F){
    double C = (F-32)*5/9.0;
    return C;
  }

  //3: Sphere volume
 double sphereVolume(double R){
    
 }
  
  //4: Cone volume


  //5: Distance between two coordinate points



  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter Temperature in Farenheit ");
      double F = Input.readDouble();
    System.out.println("Temperature in Celsius " + FtoC(F));

    //3

    //4

    //5
    
    
  }
 
}