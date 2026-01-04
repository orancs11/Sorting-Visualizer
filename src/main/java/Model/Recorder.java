package Model;

import java.util.ArrayList;

import Logic.Utilities;
import Logic.Utilities.*;

public class Recorder extends ArrayList<int[]> {

    private final int size;

    public Recorder(int size){
        super(size);
        this.size = size;
    }

    public void record(int[] a){
        this.add(a);
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("RECORD HISTORY\n");
        for(int i = 0; i < size; i++){
            result.append("=");
        }
        result.append("\n");
        for(int[] a : this){
            result.append(Utilities.toStringArray(a)).append("\n");
        }
        for(int i = 0; i < size; i++){
            result.append("=");
        }
        return result.toString();
    }





}
