class employee{
  private int empid;

  public void setempid(int eid ){
    empid=eid;
  }
  
  public int getempid(){
   return empid;
  }

}

class company{
  public static void main(String[] args){
     employee e = new employee();
     e.setempid(5);
     System.out.println(e.getempid());
  }
}