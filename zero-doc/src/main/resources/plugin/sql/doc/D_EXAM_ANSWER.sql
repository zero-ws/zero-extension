-- liquibase formatted sql

-- changeset Lang:d-doc-answer-1
-- 答案专用表：D_ANSWER
/*
 * 题目专用表
 * - 非考试模式（不依赖标准答案）
 * - 考试模式（依赖标准答案）
 */
DROP TABLE IF EXISTS D_ANSWER;
CREATE TABLE IF NOT EXISTS D_ANSWER
(

)