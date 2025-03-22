package cn.iocoder.yudao.module.pay.convert.demo;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.pay.controller.admin.demo.vo.order.PayDemoOrderCreateReqVO;
import cn.iocoder.yudao.module.pay.controller.admin.demo.vo.order.PayDemoOrderRespVO;
import cn.iocoder.yudao.module.pay.dal.dataobject.demo.PayDemoOrderDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-21T17:17:24+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class PayDemoOrderConvertImpl implements PayDemoOrderConvert {

    @Override
    public PayDemoOrderDO convert(PayDemoOrderCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        PayDemoOrderDO.PayDemoOrderDOBuilder payDemoOrderDO = PayDemoOrderDO.builder();

        payDemoOrderDO.spuId( bean.getSpuId() );

        return payDemoOrderDO.build();
    }

    @Override
    public PayDemoOrderRespVO convert(PayDemoOrderDO bean) {
        if ( bean == null ) {
            return null;
        }

        PayDemoOrderRespVO payDemoOrderRespVO = new PayDemoOrderRespVO();

        payDemoOrderRespVO.setId( bean.getId() );
        payDemoOrderRespVO.setUserId( bean.getUserId() );
        payDemoOrderRespVO.setSpuId( bean.getSpuId() );
        payDemoOrderRespVO.setSpuName( bean.getSpuName() );
        payDemoOrderRespVO.setPrice( bean.getPrice() );
        payDemoOrderRespVO.setPayStatus( bean.getPayStatus() );
        payDemoOrderRespVO.setPayOrderId( bean.getPayOrderId() );
        payDemoOrderRespVO.setPayTime( bean.getPayTime() );
        payDemoOrderRespVO.setPayChannelCode( bean.getPayChannelCode() );
        payDemoOrderRespVO.setPayRefundId( bean.getPayRefundId() );
        payDemoOrderRespVO.setRefundPrice( bean.getRefundPrice() );
        payDemoOrderRespVO.setRefundTime( bean.getRefundTime() );
        payDemoOrderRespVO.setCreateTime( bean.getCreateTime() );

        return payDemoOrderRespVO;
    }

    @Override
    public PageResult<PayDemoOrderRespVO> convertPage(PageResult<PayDemoOrderDO> page) {
        if ( page == null ) {
            return null;
        }

        PageResult<PayDemoOrderRespVO> pageResult = new PageResult<PayDemoOrderRespVO>();

        pageResult.setList( payDemoOrderDOListToPayDemoOrderRespVOList( page.getList() ) );
        pageResult.setTotal( page.getTotal() );

        return pageResult;
    }

    protected List<PayDemoOrderRespVO> payDemoOrderDOListToPayDemoOrderRespVOList(List<PayDemoOrderDO> list) {
        if ( list == null ) {
            return null;
        }

        List<PayDemoOrderRespVO> list1 = new ArrayList<PayDemoOrderRespVO>( list.size() );
        for ( PayDemoOrderDO payDemoOrderDO : list ) {
            list1.add( convert( payDemoOrderDO ) );
        }

        return list1;
    }
}
