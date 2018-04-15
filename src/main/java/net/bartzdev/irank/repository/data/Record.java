package net.bartzdev.irank.repository.data;

import java.util.LinkedHashMap;
import java.util.Map;

public class Record extends LinkedHashMap<String, Object> {

    public Record(int size) {
        super(size);
    }

    public Record(Map<? extends String, ?> map) {
        super(map);
    }

    public Record() {
        super();
    }

    public String getString(String key) {
        return (String) this.get(key);
    }

    public Integer getInt(String key) {
        return (Integer) this.get(key);
    }

    public Long getLong(String key) {
        return (Long) this.get(key);
    }
}
