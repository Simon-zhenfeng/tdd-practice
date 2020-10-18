#### 单位转换

* 任务分析：
    * 单位 unit，可以使用enum
    * 长度 length，包含了 amount，unit
    * 根据需求，需要判断单位是否相等，并没有单位转换的功能
    
* 任务拆解：
    * 初始化 length ok
    * 1 inch == 1 inches ok
    * 1 foot == 12 inches ok
    * 1 yard == 3 feet ok
    * 1 yard == 36 inches 
    * 展示length信息 ok