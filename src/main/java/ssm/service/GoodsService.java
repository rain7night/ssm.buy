package ssm.service;

import ssm.entity.Goods;

import java.util.List;

public interface GoodsService {

	/**
	 * 根据偏移量查询可用商品列表
	 *
	 * @param offset
	 * @param limit
	 * @param isRefresh
	 * @return
	 */
	List<Goods> getGoodsList(int offset, int limit, boolean isRefresh);

//	List<Goods> getGoodsListDirectly(int offset, int limit);

	/**
	 * 商品购买
	 * 
	 * @param userPhone
	 * @param goodsId
	 * @param useProcedure
	 *            是否用存储过程提高并发能力
	 */
	
	void buyGoods(long userPhone, long goodsId, boolean useProcedure);

}
