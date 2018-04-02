package com.wiipu.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AutowineWineBuyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AutowineWineBuyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWineBuyIdIsNull() {
            addCriterion("wine_buy_id is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdIsNotNull() {
            addCriterion("wine_buy_id is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdEqualTo(Integer value) {
            addCriterion("wine_buy_id =", value, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdNotEqualTo(Integer value) {
            addCriterion("wine_buy_id <>", value, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdGreaterThan(Integer value) {
            addCriterion("wine_buy_id >", value, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_id >=", value, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdLessThan(Integer value) {
            addCriterion("wine_buy_id <", value, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_id <=", value, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdIn(List<Integer> values) {
            addCriterion("wine_buy_id in", values, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdNotIn(List<Integer> values) {
            addCriterion("wine_buy_id not in", values, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_id between", value1, value2, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_id not between", value1, value2, "wineBuyId");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentIsNull() {
            addCriterion("wine_buy_department is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentIsNotNull() {
            addCriterion("wine_buy_department is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentEqualTo(Integer value) {
            addCriterion("wine_buy_department =", value, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentNotEqualTo(Integer value) {
            addCriterion("wine_buy_department <>", value, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentGreaterThan(Integer value) {
            addCriterion("wine_buy_department >", value, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_department >=", value, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentLessThan(Integer value) {
            addCriterion("wine_buy_department <", value, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_department <=", value, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentIn(List<Integer> values) {
            addCriterion("wine_buy_department in", values, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentNotIn(List<Integer> values) {
            addCriterion("wine_buy_department not in", values, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_department between", value1, value2, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_department not between", value1, value2, "wineBuyDepartment");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminIsNull() {
            addCriterion("wine_buy_admin is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminIsNotNull() {
            addCriterion("wine_buy_admin is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminEqualTo(Integer value) {
            addCriterion("wine_buy_admin =", value, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminNotEqualTo(Integer value) {
            addCriterion("wine_buy_admin <>", value, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminGreaterThan(Integer value) {
            addCriterion("wine_buy_admin >", value, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_admin >=", value, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminLessThan(Integer value) {
            addCriterion("wine_buy_admin <", value, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_admin <=", value, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminIn(List<Integer> values) {
            addCriterion("wine_buy_admin in", values, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminNotIn(List<Integer> values) {
            addCriterion("wine_buy_admin not in", values, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_admin between", value1, value2, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_admin not between", value1, value2, "wineBuyAdmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeIsNull() {
            addCriterion("wine_buy_addtime is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeIsNotNull() {
            addCriterion("wine_buy_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeEqualTo(Long value) {
            addCriterion("wine_buy_addtime =", value, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeNotEqualTo(Long value) {
            addCriterion("wine_buy_addtime <>", value, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeGreaterThan(Long value) {
            addCriterion("wine_buy_addtime >", value, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wine_buy_addtime >=", value, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeLessThan(Long value) {
            addCriterion("wine_buy_addtime <", value, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeLessThanOrEqualTo(Long value) {
            addCriterion("wine_buy_addtime <=", value, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeIn(List<Long> values) {
            addCriterion("wine_buy_addtime in", values, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeNotIn(List<Long> values) {
            addCriterion("wine_buy_addtime not in", values, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeBetween(Long value1, Long value2) {
            addCriterion("wine_buy_addtime between", value1, value2, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddtimeNotBetween(Long value1, Long value2) {
            addCriterion("wine_buy_addtime not between", value1, value2, "wineBuyAddtime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeIsNull() {
            addCriterion("wine_buy_expecttime is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeIsNotNull() {
            addCriterion("wine_buy_expecttime is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeEqualTo(Long value) {
            addCriterion("wine_buy_expecttime =", value, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeNotEqualTo(Long value) {
            addCriterion("wine_buy_expecttime <>", value, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeGreaterThan(Long value) {
            addCriterion("wine_buy_expecttime >", value, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wine_buy_expecttime >=", value, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeLessThan(Long value) {
            addCriterion("wine_buy_expecttime <", value, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeLessThanOrEqualTo(Long value) {
            addCriterion("wine_buy_expecttime <=", value, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeIn(List<Long> values) {
            addCriterion("wine_buy_expecttime in", values, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeNotIn(List<Long> values) {
            addCriterion("wine_buy_expecttime not in", values, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeBetween(Long value1, Long value2) {
            addCriterion("wine_buy_expecttime between", value1, value2, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyExpecttimeNotBetween(Long value1, Long value2) {
            addCriterion("wine_buy_expecttime not between", value1, value2, "wineBuyExpecttime");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusIsNull() {
            addCriterion("wine_buy_status is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusIsNotNull() {
            addCriterion("wine_buy_status is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusEqualTo(Short value) {
            addCriterion("wine_buy_status =", value, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusNotEqualTo(Short value) {
            addCriterion("wine_buy_status <>", value, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusGreaterThan(Short value) {
            addCriterion("wine_buy_status >", value, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("wine_buy_status >=", value, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusLessThan(Short value) {
            addCriterion("wine_buy_status <", value, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusLessThanOrEqualTo(Short value) {
            addCriterion("wine_buy_status <=", value, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusIn(List<Short> values) {
            addCriterion("wine_buy_status in", values, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusNotIn(List<Short> values) {
            addCriterion("wine_buy_status not in", values, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusBetween(Short value1, Short value2) {
            addCriterion("wine_buy_status between", value1, value2, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyStatusNotBetween(Short value1, Short value2) {
            addCriterion("wine_buy_status not between", value1, value2, "wineBuyStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineIsNull() {
            addCriterion("wine_buy_wine is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineIsNotNull() {
            addCriterion("wine_buy_wine is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineEqualTo(Integer value) {
            addCriterion("wine_buy_wine =", value, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineNotEqualTo(Integer value) {
            addCriterion("wine_buy_wine <>", value, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineGreaterThan(Integer value) {
            addCriterion("wine_buy_wine >", value, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_wine >=", value, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineLessThan(Integer value) {
            addCriterion("wine_buy_wine <", value, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_wine <=", value, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineIn(List<Integer> values) {
            addCriterion("wine_buy_wine in", values, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineNotIn(List<Integer> values) {
            addCriterion("wine_buy_wine not in", values, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_wine between", value1, value2, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyWineNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_wine not between", value1, value2, "wineBuyWine");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutIsNull() {
            addCriterion("wine_buy_accout is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutIsNotNull() {
            addCriterion("wine_buy_accout is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutEqualTo(Integer value) {
            addCriterion("wine_buy_accout =", value, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutNotEqualTo(Integer value) {
            addCriterion("wine_buy_accout <>", value, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutGreaterThan(Integer value) {
            addCriterion("wine_buy_accout >", value, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_accout >=", value, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutLessThan(Integer value) {
            addCriterion("wine_buy_accout <", value, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_accout <=", value, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutIn(List<Integer> values) {
            addCriterion("wine_buy_accout in", values, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutNotIn(List<Integer> values) {
            addCriterion("wine_buy_accout not in", values, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_accout between", value1, value2, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyAccoutNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_accout not between", value1, value2, "wineBuyAccout");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialIsNull() {
            addCriterion("wine_buy_material is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialIsNotNull() {
            addCriterion("wine_buy_material is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialEqualTo(Integer value) {
            addCriterion("wine_buy_material =", value, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialNotEqualTo(Integer value) {
            addCriterion("wine_buy_material <>", value, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialGreaterThan(Integer value) {
            addCriterion("wine_buy_material >", value, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_material >=", value, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialLessThan(Integer value) {
            addCriterion("wine_buy_material <", value, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_material <=", value, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialIn(List<Integer> values) {
            addCriterion("wine_buy_material in", values, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialNotIn(List<Integer> values) {
            addCriterion("wine_buy_material not in", values, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_material between", value1, value2, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuyMaterialNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_material not between", value1, value2, "wineBuyMaterial");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierIsNull() {
            addCriterion("wine_buy_supplier is null");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierIsNotNull() {
            addCriterion("wine_buy_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierEqualTo(Integer value) {
            addCriterion("wine_buy_supplier =", value, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierNotEqualTo(Integer value) {
            addCriterion("wine_buy_supplier <>", value, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierGreaterThan(Integer value) {
            addCriterion("wine_buy_supplier >", value, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_supplier >=", value, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierLessThan(Integer value) {
            addCriterion("wine_buy_supplier <", value, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_supplier <=", value, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierIn(List<Integer> values) {
            addCriterion("wine_buy_supplier in", values, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierNotIn(List<Integer> values) {
            addCriterion("wine_buy_supplier not in", values, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_supplier between", value1, value2, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuySupplierNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_supplier not between", value1, value2, "wineBuySupplier");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderIsNull() {
            addCriterion("wine_buy_order is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderIsNotNull() {
            addCriterion("wine_buy_order is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderEqualTo(String value) {
            addCriterion("wine_buy_order =", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderNotEqualTo(String value) {
            addCriterion("wine_buy_order <>", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderGreaterThan(String value) {
            addCriterion("wine_buy_order >", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderGreaterThanOrEqualTo(String value) {
            addCriterion("wine_buy_order >=", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderLessThan(String value) {
            addCriterion("wine_buy_order <", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderLessThanOrEqualTo(String value) {
            addCriterion("wine_buy_order <=", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderLike(String value) {
            addCriterion("wine_buy_order like", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderNotLike(String value) {
            addCriterion("wine_buy_order not like", value, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderIn(List<String> values) {
            addCriterion("wine_buy_order in", values, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderNotIn(List<String> values) {
            addCriterion("wine_buy_order not in", values, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderBetween(String value1, String value2) {
            addCriterion("wine_buy_order between", value1, value2, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyOrderNotBetween(String value1, String value2) {
            addCriterion("wine_buy_order not between", value1, value2, "wineBuyOrder");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceIsNull() {
            addCriterion("wine_buy_price is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceIsNotNull() {
            addCriterion("wine_buy_price is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceEqualTo(BigDecimal value) {
            addCriterion("wine_buy_price =", value, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceNotEqualTo(BigDecimal value) {
            addCriterion("wine_buy_price <>", value, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceGreaterThan(BigDecimal value) {
            addCriterion("wine_buy_price >", value, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wine_buy_price >=", value, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceLessThan(BigDecimal value) {
            addCriterion("wine_buy_price <", value, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wine_buy_price <=", value, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceIn(List<BigDecimal> values) {
            addCriterion("wine_buy_price in", values, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceNotIn(List<BigDecimal> values) {
            addCriterion("wine_buy_price not in", values, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wine_buy_price between", value1, value2, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wine_buy_price not between", value1, value2, "wineBuyPrice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceIsNull() {
            addCriterion("wine_buy_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceIsNotNull() {
            addCriterion("wine_buy_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceEqualTo(BigDecimal value) {
            addCriterion("wine_buy_totalprice =", value, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("wine_buy_totalprice <>", value, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("wine_buy_totalprice >", value, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wine_buy_totalprice >=", value, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceLessThan(BigDecimal value) {
            addCriterion("wine_buy_totalprice <", value, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wine_buy_totalprice <=", value, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceIn(List<BigDecimal> values) {
            addCriterion("wine_buy_totalprice in", values, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("wine_buy_totalprice not in", values, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wine_buy_totalprice between", value1, value2, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wine_buy_totalprice not between", value1, value2, "wineBuyTotalprice");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillIsNull() {
            addCriterion("wine_buy_bill is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillIsNotNull() {
            addCriterion("wine_buy_bill is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillEqualTo(Integer value) {
            addCriterion("wine_buy_bill =", value, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillNotEqualTo(Integer value) {
            addCriterion("wine_buy_bill <>", value, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillGreaterThan(Integer value) {
            addCriterion("wine_buy_bill >", value, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_bill >=", value, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillLessThan(Integer value) {
            addCriterion("wine_buy_bill <", value, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_bill <=", value, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillIn(List<Integer> values) {
            addCriterion("wine_buy_bill in", values, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillNotIn(List<Integer> values) {
            addCriterion("wine_buy_bill not in", values, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_bill between", value1, value2, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyBillNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_bill not between", value1, value2, "wineBuyBill");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityIsNull() {
            addCriterion("wine_buy_capacity is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityIsNotNull() {
            addCriterion("wine_buy_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityEqualTo(Integer value) {
            addCriterion("wine_buy_capacity =", value, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityNotEqualTo(Integer value) {
            addCriterion("wine_buy_capacity <>", value, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityGreaterThan(Integer value) {
            addCriterion("wine_buy_capacity >", value, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_capacity >=", value, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityLessThan(Integer value) {
            addCriterion("wine_buy_capacity <", value, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_capacity <=", value, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityIn(List<Integer> values) {
            addCriterion("wine_buy_capacity in", values, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityNotIn(List<Integer> values) {
            addCriterion("wine_buy_capacity not in", values, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_capacity between", value1, value2, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_capacity not between", value1, value2, "wineBuyCapacity");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactIsNull() {
            addCriterion("wine_buy_compact is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactIsNotNull() {
            addCriterion("wine_buy_compact is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactEqualTo(String value) {
            addCriterion("wine_buy_compact =", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactNotEqualTo(String value) {
            addCriterion("wine_buy_compact <>", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactGreaterThan(String value) {
            addCriterion("wine_buy_compact >", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactGreaterThanOrEqualTo(String value) {
            addCriterion("wine_buy_compact >=", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactLessThan(String value) {
            addCriterion("wine_buy_compact <", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactLessThanOrEqualTo(String value) {
            addCriterion("wine_buy_compact <=", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactLike(String value) {
            addCriterion("wine_buy_compact like", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactNotLike(String value) {
            addCriterion("wine_buy_compact not like", value, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactIn(List<String> values) {
            addCriterion("wine_buy_compact in", values, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactNotIn(List<String> values) {
            addCriterion("wine_buy_compact not in", values, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactBetween(String value1, String value2) {
            addCriterion("wine_buy_compact between", value1, value2, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyCompactNotBetween(String value1, String value2) {
            addCriterion("wine_buy_compact not between", value1, value2, "wineBuyCompact");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminIsNull() {
            addCriterion("wine_buy_addadmin is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminIsNotNull() {
            addCriterion("wine_buy_addadmin is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminEqualTo(Integer value) {
            addCriterion("wine_buy_addadmin =", value, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminNotEqualTo(Integer value) {
            addCriterion("wine_buy_addadmin <>", value, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminGreaterThan(Integer value) {
            addCriterion("wine_buy_addadmin >", value, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_addadmin >=", value, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminLessThan(Integer value) {
            addCriterion("wine_buy_addadmin <", value, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_addadmin <=", value, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminIn(List<Integer> values) {
            addCriterion("wine_buy_addadmin in", values, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminNotIn(List<Integer> values) {
            addCriterion("wine_buy_addadmin not in", values, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_addadmin between", value1, value2, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyAddadminNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_addadmin not between", value1, value2, "wineBuyAddadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeIsNull() {
            addCriterion("wine_buy_buytime is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeIsNotNull() {
            addCriterion("wine_buy_buytime is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeEqualTo(Long value) {
            addCriterion("wine_buy_buytime =", value, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeNotEqualTo(Long value) {
            addCriterion("wine_buy_buytime <>", value, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeGreaterThan(Long value) {
            addCriterion("wine_buy_buytime >", value, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wine_buy_buytime >=", value, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeLessThan(Long value) {
            addCriterion("wine_buy_buytime <", value, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeLessThanOrEqualTo(Long value) {
            addCriterion("wine_buy_buytime <=", value, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeIn(List<Long> values) {
            addCriterion("wine_buy_buytime in", values, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeNotIn(List<Long> values) {
            addCriterion("wine_buy_buytime not in", values, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeBetween(Long value1, Long value2) {
            addCriterion("wine_buy_buytime between", value1, value2, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyBuytimeNotBetween(Long value1, Long value2) {
            addCriterion("wine_buy_buytime not between", value1, value2, "wineBuyBuytime");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatIsNull() {
            addCriterion("wine_buy_fat is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatIsNotNull() {
            addCriterion("wine_buy_fat is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatEqualTo(Integer value) {
            addCriterion("wine_buy_fat =", value, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatNotEqualTo(Integer value) {
            addCriterion("wine_buy_fat <>", value, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatGreaterThan(Integer value) {
            addCriterion("wine_buy_fat >", value, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_fat >=", value, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatLessThan(Integer value) {
            addCriterion("wine_buy_fat <", value, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_fat <=", value, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatIn(List<Integer> values) {
            addCriterion("wine_buy_fat in", values, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatNotIn(List<Integer> values) {
            addCriterion("wine_buy_fat not in", values, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_fat between", value1, value2, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyFatNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_fat not between", value1, value2, "wineBuyFat");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminIsNull() {
            addCriterion("wine_buy_checkadmin is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminIsNotNull() {
            addCriterion("wine_buy_checkadmin is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminEqualTo(Integer value) {
            addCriterion("wine_buy_checkadmin =", value, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminNotEqualTo(Integer value) {
            addCriterion("wine_buy_checkadmin <>", value, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminGreaterThan(Integer value) {
            addCriterion("wine_buy_checkadmin >", value, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_checkadmin >=", value, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminLessThan(Integer value) {
            addCriterion("wine_buy_checkadmin <", value, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_checkadmin <=", value, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminIn(List<Integer> values) {
            addCriterion("wine_buy_checkadmin in", values, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminNotIn(List<Integer> values) {
            addCriterion("wine_buy_checkadmin not in", values, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_checkadmin between", value1, value2, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckadminNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_checkadmin not between", value1, value2, "wineBuyCheckadmin");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeIsNull() {
            addCriterion("wine_buy_checktime is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeIsNotNull() {
            addCriterion("wine_buy_checktime is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeEqualTo(Long value) {
            addCriterion("wine_buy_checktime =", value, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeNotEqualTo(Long value) {
            addCriterion("wine_buy_checktime <>", value, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeGreaterThan(Long value) {
            addCriterion("wine_buy_checktime >", value, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeGreaterThanOrEqualTo(Long value) {
            addCriterion("wine_buy_checktime >=", value, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeLessThan(Long value) {
            addCriterion("wine_buy_checktime <", value, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeLessThanOrEqualTo(Long value) {
            addCriterion("wine_buy_checktime <=", value, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeIn(List<Long> values) {
            addCriterion("wine_buy_checktime in", values, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeNotIn(List<Long> values) {
            addCriterion("wine_buy_checktime not in", values, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeBetween(Long value1, Long value2) {
            addCriterion("wine_buy_checktime between", value1, value2, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyChecktimeNotBetween(Long value1, Long value2) {
            addCriterion("wine_buy_checktime not between", value1, value2, "wineBuyChecktime");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionIsNull() {
            addCriterion("wine_buy_checkopinion is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionIsNotNull() {
            addCriterion("wine_buy_checkopinion is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionEqualTo(String value) {
            addCriterion("wine_buy_checkopinion =", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionNotEqualTo(String value) {
            addCriterion("wine_buy_checkopinion <>", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionGreaterThan(String value) {
            addCriterion("wine_buy_checkopinion >", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionGreaterThanOrEqualTo(String value) {
            addCriterion("wine_buy_checkopinion >=", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionLessThan(String value) {
            addCriterion("wine_buy_checkopinion <", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionLessThanOrEqualTo(String value) {
            addCriterion("wine_buy_checkopinion <=", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionLike(String value) {
            addCriterion("wine_buy_checkopinion like", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionNotLike(String value) {
            addCriterion("wine_buy_checkopinion not like", value, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionIn(List<String> values) {
            addCriterion("wine_buy_checkopinion in", values, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionNotIn(List<String> values) {
            addCriterion("wine_buy_checkopinion not in", values, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionBetween(String value1, String value2) {
            addCriterion("wine_buy_checkopinion between", value1, value2, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckopinionNotBetween(String value1, String value2) {
            addCriterion("wine_buy_checkopinion not between", value1, value2, "wineBuyCheckopinion");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusIsNull() {
            addCriterion("wine_buy_checkstatus is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusIsNotNull() {
            addCriterion("wine_buy_checkstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusEqualTo(Integer value) {
            addCriterion("wine_buy_checkstatus =", value, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusNotEqualTo(Integer value) {
            addCriterion("wine_buy_checkstatus <>", value, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusGreaterThan(Integer value) {
            addCriterion("wine_buy_checkstatus >", value, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_checkstatus >=", value, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusLessThan(Integer value) {
            addCriterion("wine_buy_checkstatus <", value, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_checkstatus <=", value, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusIn(List<Integer> values) {
            addCriterion("wine_buy_checkstatus in", values, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusNotIn(List<Integer> values) {
            addCriterion("wine_buy_checkstatus not in", values, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_checkstatus between", value1, value2, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_checkstatus not between", value1, value2, "wineBuyCheckstatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusIsNull() {
            addCriterion("wine_buy_inhouse_status is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusIsNotNull() {
            addCriterion("wine_buy_inhouse_status is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_status =", value, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusNotEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_status <>", value, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusGreaterThan(Integer value) {
            addCriterion("wine_buy_inhouse_status >", value, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_status >=", value, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusLessThan(Integer value) {
            addCriterion("wine_buy_inhouse_status <", value, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_status <=", value, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusIn(List<Integer> values) {
            addCriterion("wine_buy_inhouse_status in", values, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusNotIn(List<Integer> values) {
            addCriterion("wine_buy_inhouse_status not in", values, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_inhouse_status between", value1, value2, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_inhouse_status not between", value1, value2, "wineBuyInhouseStatus");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountIsNull() {
            addCriterion("wine_buy_inhouse_amount is null");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountIsNotNull() {
            addCriterion("wine_buy_inhouse_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_amount =", value, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountNotEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_amount <>", value, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountGreaterThan(Integer value) {
            addCriterion("wine_buy_inhouse_amount >", value, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_amount >=", value, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountLessThan(Integer value) {
            addCriterion("wine_buy_inhouse_amount <", value, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountLessThanOrEqualTo(Integer value) {
            addCriterion("wine_buy_inhouse_amount <=", value, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountIn(List<Integer> values) {
            addCriterion("wine_buy_inhouse_amount in", values, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountNotIn(List<Integer> values) {
            addCriterion("wine_buy_inhouse_amount not in", values, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_inhouse_amount between", value1, value2, "wineBuyInhouseAmount");
            return (Criteria) this;
        }

        public Criteria andWineBuyInhouseAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("wine_buy_inhouse_amount not between", value1, value2, "wineBuyInhouseAmount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}