package cn.hzxy.bean;

import java.util.List;

/**
 * 分页
 * @author 大闲鱼
 *
 */
public class EUDataGridResult {
	private long total;
	private List<?> rows;

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
