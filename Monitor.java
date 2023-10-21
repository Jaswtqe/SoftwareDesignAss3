package H;

class Monitor implements HDMIAdapter{
     private ComputerCase computerCase;

     public Monitor(ComputerCase computerCase) {
          this.computerCase = computerCase;
     }

     @Override
     public void display() {
          System.out.println("Преобразование HDMI сигнала и вывод на монитор");
          computerCase.displayOnHDMI();
     }
}