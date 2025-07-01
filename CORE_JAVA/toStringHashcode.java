class Laptop{
    String model;
    int price;

    public String toString(){   //it will override built in toString method of Object class
        return model+ ':' + price;
    }

    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price==that.price;
    }

    /*
     * right click->source action -> generate hashcode() & equals()
     * will automitacally generete those methods
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    

}

public class toStringHashcode {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.model="Lenovo Yago";
        obj.price=1000;

        Laptop obj1=new Laptop();
        obj1.model="Lenovo Yago";
        obj1.price=1000;

        boolean result= obj.equals(obj1);   //equals is a built in fucntion of Object super class

        System.out.println(obj);    //it will call toString function of in built Object class, if not define in Laptop class
        System.out.println(obj.toString());    //it will be same output
        System.out.println(result);
        
    }
}
