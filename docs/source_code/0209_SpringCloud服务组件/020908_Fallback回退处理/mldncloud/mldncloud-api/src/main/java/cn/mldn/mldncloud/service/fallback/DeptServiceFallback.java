package cn.mldn.mldncloud.service.fallback;		// 该程序包需要配置扫描

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.mldn.mldncloud.dto.DeptDTO;
import cn.mldn.mldncloud.service.IDeptService;
@Component										// 配置Bean
public class DeptServiceFallback implements IDeptService {
	@Override
	public DeptDTO add(DeptDTO dto) {
		DeptDTO returnDto = new DeptDTO();
		returnDto.setDeptno(-1L);
		returnDto.setDname("部门名称 - DeptServiceFallback");
		returnDto.setLoc("部门位置 - DeptServiceFallback");
		return returnDto;
	}

	@Override
	public DeptDTO get(long deptno) {
		DeptDTO returnDto = new DeptDTO();
		returnDto.setDeptno(deptno);
		returnDto.setDname("部门名称 - DeptServiceFallback");
		returnDto.setLoc("部门位置 - DeptServiceFallback");
		return returnDto;
	}

	@Override
	public List<DeptDTO> list() {
		return new ArrayList<DeptDTO>(); 
	}
}
