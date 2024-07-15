import java.time.LocalDate;

public class Admin extends User {
  
    // TODO: Add method doSomething to print "Hello admin "+name+"!"
    // We need to use "getter method" instead of "field" as shown. Why is that?
    public void doSomething() {
      if (getDob().equals(LocalDate.now())){
        System.out.println("Happy birthday Admin!");

      }else{
        System.out.println("Hello admin "+this.getName()+"!");

      }
    }
    // TODO: Add method doSomething(int n) to print super.doSomething() n times.
    public void doSomething(int n) {
        for (int i=0;i<n;i++){
       super.doSomething();
        }
    }
  
  }
  