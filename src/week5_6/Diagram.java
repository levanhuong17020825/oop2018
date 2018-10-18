package week5_6;

/**
 * Created by CCNE on 18/10/2018.
 */
class Diagram extends Vector<Layer>{

    public Diagram() {
        super(0);
    }

    public Diagram(int initialCapacity) {
        super(initialCapacity);
    }
    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
