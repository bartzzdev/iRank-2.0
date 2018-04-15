package net.bartzdev.irank.repository.data;

public interface Data {

    default Record serialize(Record record) {
        record.putIfAbsent("id", getId());
        return record;
    }

    long getId();
}
