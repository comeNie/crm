-- 手动券规则-营销计划（外键）
CREATE INDEX IDX_RULEHAND_FMARKETPLANID ON T_CRM_RULECOUPONHAND (FMARKETPLANID);
-- 优惠券表-营销计划（外键）
CREATE INDEX IDX_COUPON_FMARKETPLANID ON T_CRM_COUPON (FMARKETPLANID);
-- 优惠券表-营销计划、优惠券状态
CREATE INDEX IDX_COUPON_PLANID_STATUS ON T_CRM_COUPON (FMARKETPLANID,FSTATUS);
