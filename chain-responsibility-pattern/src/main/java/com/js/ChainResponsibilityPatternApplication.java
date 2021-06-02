package com.js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainResponsibilityPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainResponsibilityPatternApplication.class, args);
    }

}
/**
 * @return 责任链模式将链中的每一个节点都看作一个对象，每一个节点处理的请求不同，且内部自动维护下一个节点对象
 * 当一个请求从链式的首端发出时，会沿着责任链预设的路径依次传递到每一个节点对象，直至被链中的某个对象处理为止
 * 属于行为型设计模式
 * 责任链主要适用以下场景
 * 1）多个对象可以处理统一个请求但具体由哪个对象处理则在运行时动态决定
 * 2）在不明确指定接收者的情况下向多个对象中的一个提交请求
 * 3）可以动态指定一组动态处理请求
 * 责任链模式主要包含两个角色
 * 1）抽象处理者：定义一个请求处理的方法，并维护一个下一处理节点对象的引用
 * 2）具体处理者：对请求进行处理，如果不感兴趣，则进行转发
 */
