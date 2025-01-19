主要工作原理：
1. 先进行扫描，得到所有BeanDefinition，得到一个beanDefinitionMap
2. 根据beanDefinitionMap实例化所有的bean（createBean方法），得到singletonObjects
    - 依赖注入
    - Aware回调
    - 初始化前 BeanPostProcessor
    - 初始化 InitializingBean
    - 初始化后 BeanPostProcessor(AOP代理)
3. 通过singletonObjects(getBean方法)获取bean