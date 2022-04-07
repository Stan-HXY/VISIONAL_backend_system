package com.Visional.project.api;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RESTfulApi {
    private final Map<Integer, Map<String, Object>> dataMap;

    // ----------------- Constructor -----------------
    public RESTfulApi(){
        dataMap = new HashMap<>();
        for(int i = 1; i < 3; i++){
            Map<String, Object> data = new HashMap<>();
            data.put("id", i);
            data.put("name", "name" + i);
            dataMap.put(i, data);
        }
    }

    @GetMapping("/objects/{id}") // gets object resource with {id} param
    public Map<String, Object> getData(@PathVariable Integer id){
        // @PathVariable: associate mapping's {id} with function's param {id}
        return dataMap.get(id);
    }

    @DeleteMapping("/objects/{id}")
    public String deleteData(@PathVariable Integer id){
        dataMap.remove(id);
        return "Delete Success.";
    }

    @PostMapping("/objects")
    // Find how many ids have been added, then we know the right id's value to create and insert
    public String postData(@RequestBody Map<String, Object> data){
        // @RequestBody: encapsulate param and output as JSON
        Integer idArray[] = dataMap.keySet().toArray(new Integer[0]);
        Arrays.sort(idArray);
        int nextId = idArray[idArray.length - 1] + 1; // next id's value
        dataMap.put(nextId, data);
        return "Post Success.";
    }

    @PutMapping("/objects")
    public String putData(@RequestBody Map<String, Object> data){
        Integer id = Integer.valueOf(String.valueOf(data.get("id"))); // Cast Obj->Integer
        Map<String, Object> containedData = dataMap.get(id);

        if(containedData == null){ // if certain id doesn't exist
            // Same as PostData: Create new entry
            Integer idArray[] = dataMap.keySet().toArray(new Integer[0]);
            Arrays.sort(idArray);
            int nextId = idArray[idArray.length - 1] + 1; // next id's value
            dataMap.put(nextId, data);
        }
        else{ // certain id exist
            dataMap.put(id, data); // update the entry with param
        }
        return "Put Success";
    }
}
