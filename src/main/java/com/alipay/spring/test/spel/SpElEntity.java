package com.alipay.spring.test.spel;

/**
 * @author yi.xia
 * @date Create At 2020/10/17
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
public class SpElEntity {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static SpElEntity of(String id) {
        SpElEntity spElEntity = new SpElEntity();
        spElEntity.setId(id);
        return spElEntity;
    }
}
