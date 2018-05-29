package net.person.model.json;

import java.util.List;

/**
 * Json数组类
 * Created by a2665 on 2018/2/5.
 */
public class ListObject extends AbstractJsonObject {

    // 列表对象
    private List<?> items;

    public List<?> getItems() {
        return items;
    }

    public void setItems(List<?> items) {
        this.items = items;
    }

}
