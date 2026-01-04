package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Recorder extends ArrayList<int[]> {

    public Recorder(int size){
        super(size);
    }

    public void record(int[] a){
        this.add(a);
    }

    @Override
    public String toString(){
        return this.stream().forEach(
                {

                }
        );
    }





}
