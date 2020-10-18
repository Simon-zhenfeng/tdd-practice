#### 单位转换，任务分解

* 任务分析：
    * length 负责长度，包含了amount和unit
    * unit 负责单位，是enum类型
    * 使用length进行单位转换
    
* 任务拆解：
    * 创建length
    * 1 inch == 1 inch
    * 1 foot == 12 inch
    * 1 yard == 3 feet
    * 1 yard = 36 inch
    * 显示length的信息