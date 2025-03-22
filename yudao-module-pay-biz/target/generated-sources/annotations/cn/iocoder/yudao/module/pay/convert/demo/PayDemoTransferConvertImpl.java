package cn.iocoder.yudao.module.pay.convert.demo;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.pay.controller.admin.demo.vo.transfer.PayDemoTransferCreateReqVO;
import cn.iocoder.yudao.module.pay.controller.admin.demo.vo.transfer.PayDemoTransferRespVO;
import cn.iocoder.yudao.module.pay.dal.dataobject.demo.PayDemoTransferDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-21T17:17:24+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class PayDemoTransferConvertImpl implements PayDemoTransferConvert {

    @Override
    public PayDemoTransferDO convert(PayDemoTransferCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        PayDemoTransferDO payDemoTransferDO = new PayDemoTransferDO();

        payDemoTransferDO.setType( bean.getType() );
        payDemoTransferDO.setPrice( bean.getPrice() );
        payDemoTransferDO.setUserName( bean.getUserName() );
        payDemoTransferDO.setAlipayLogonId( bean.getAlipayLogonId() );
        payDemoTransferDO.setOpenid( bean.getOpenid() );

        return payDemoTransferDO;
    }

    @Override
    public PageResult<PayDemoTransferRespVO> convertPage(PageResult<PayDemoTransferDO> pageResult) {
        if ( pageResult == null ) {
            return null;
        }

        PageResult<PayDemoTransferRespVO> pageResult1 = new PageResult<PayDemoTransferRespVO>();

        pageResult1.setList( payDemoTransferDOListToPayDemoTransferRespVOList( pageResult.getList() ) );
        pageResult1.setTotal( pageResult.getTotal() );

        return pageResult1;
    }

    protected PayDemoTransferRespVO payDemoTransferDOToPayDemoTransferRespVO(PayDemoTransferDO payDemoTransferDO) {
        if ( payDemoTransferDO == null ) {
            return null;
        }

        PayDemoTransferRespVO payDemoTransferRespVO = new PayDemoTransferRespVO();

        payDemoTransferRespVO.setId( payDemoTransferDO.getId() );
        payDemoTransferRespVO.setAppId( payDemoTransferDO.getAppId() );
        payDemoTransferRespVO.setPrice( payDemoTransferDO.getPrice() );
        payDemoTransferRespVO.setType( payDemoTransferDO.getType() );
        payDemoTransferRespVO.setUserName( payDemoTransferDO.getUserName() );
        payDemoTransferRespVO.setAlipayLogonId( payDemoTransferDO.getAlipayLogonId() );
        payDemoTransferRespVO.setOpenid( payDemoTransferDO.getOpenid() );
        payDemoTransferRespVO.setTransferStatus( payDemoTransferDO.getTransferStatus() );
        payDemoTransferRespVO.setPayTransferId( payDemoTransferDO.getPayTransferId() );
        payDemoTransferRespVO.setPayChannelCode( payDemoTransferDO.getPayChannelCode() );
        payDemoTransferRespVO.setTransferTime( payDemoTransferDO.getTransferTime() );

        return payDemoTransferRespVO;
    }

    protected List<PayDemoTransferRespVO> payDemoTransferDOListToPayDemoTransferRespVOList(List<PayDemoTransferDO> list) {
        if ( list == null ) {
            return null;
        }

        List<PayDemoTransferRespVO> list1 = new ArrayList<PayDemoTransferRespVO>( list.size() );
        for ( PayDemoTransferDO payDemoTransferDO : list ) {
            list1.add( payDemoTransferDOToPayDemoTransferRespVO( payDemoTransferDO ) );
        }

        return list1;
    }
}
