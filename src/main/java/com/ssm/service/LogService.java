package com.ssm.service;

import org.aspectj.lang.JoinPoint;

import com.ssm.model.OperLog;

/**
 * @description：操作日志
 */
public interface LogService {

    void insertLog(OperLog log); // 插入日志

    void saveByJoinPoint(JoinPoint joinPoint, Exception e);
}
