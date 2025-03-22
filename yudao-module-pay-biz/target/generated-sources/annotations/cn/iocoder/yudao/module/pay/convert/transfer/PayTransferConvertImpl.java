package cn.iocoder.yudao.module.pay.convert.transfer;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.pay.core.client.dto.transfer.PayTransferUnifiedReqDTO;
import cn.iocoder.yudao.module.pay.api.transfer.dto.PayTransferCreateReqDTO;
import cn.iocoder.yudao.module.pay.controller.admin.demo.vo.transfer.PayDemoTransferCreateReqVO;
import cn.iocoder.yudao.module.pay.controller.admin.transfer.vo.PayTransferCreateReqVO;
import cn.iocoder.yudao.module.pay.controller.admin.transfer.vo.PayTransferPageItemRespVO;
import cn.iocoder.yudao.module.pay.controller.admin.transfer.vo.PayTransferRespVO;
import cn.iocoder.yudao.module.pay.dal.dataobject.transfer.PayTransferDO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-21T17:17:24+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class PayTransferConvertImpl implements PayTransferConvert {

    @Override
    public PayTransferDO convert(PayTransferCreateReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PayTransferDO payTransferDO = new PayTransferDO();

        payTransferDO.setChannelCode( dto.getChannelCode() );
        payTransferDO.setMerchantTransferId( dto.getMerchantTransferId() );
        payTransferDO.setType( dto.getType() );
        payTransferDO.setSubject( dto.getSubject() );
        payTransferDO.setPrice( dto.getPrice() );
        payTransferDO.setUserName( dto.getUserName() );
        payTransferDO.setAlipayLogonId( dto.getAlipayLogonId() );
        payTransferDO.setOpenid( dto.getOpenid() );
        payTransferDO.setUserIp( dto.getUserIp() );
        Map<String, String> map = dto.getChannelExtras();
        if ( map != null ) {
            payTransferDO.setChannelExtras( new LinkedHashMap<String, String>( map ) );
        }

        return payTransferDO;
    }

    @Override
    public PayTransferUnifiedReqDTO convert2(PayTransferDO dto) {
        if ( dto == null ) {
            return null;
        }

        PayTransferUnifiedReqDTO payTransferUnifiedReqDTO = new PayTransferUnifiedReqDTO();

        payTransferUnifiedReqDTO.setType( dto.getType() );
        payTransferUnifiedReqDTO.setUserIp( dto.getUserIp() );
        payTransferUnifiedReqDTO.setPrice( dto.getPrice() );
        payTransferUnifiedReqDTO.setSubject( dto.getSubject() );
        payTransferUnifiedReqDTO.setUserName( dto.getUserName() );
        payTransferUnifiedReqDTO.setAlipayLogonId( dto.getAlipayLogonId() );
        payTransferUnifiedReqDTO.setOpenid( dto.getOpenid() );
        Map<String, String> map = dto.getChannelExtras();
        if ( map != null ) {
            payTransferUnifiedReqDTO.setChannelExtras( new LinkedHashMap<String, String>( map ) );
        }
        payTransferUnifiedReqDTO.setNotifyUrl( dto.getNotifyUrl() );

        return payTransferUnifiedReqDTO;
    }

    @Override
    public PayTransferCreateReqDTO convert(PayTransferCreateReqVO vo) {
        if ( vo == null ) {
            return null;
        }

        PayTransferCreateReqDTO payTransferCreateReqDTO = new PayTransferCreateReqDTO();

        payTransferCreateReqDTO.setChannelCode( vo.getChannelCode() );
        Map<String, String> map = vo.getChannelExtras();
        if ( map != null ) {
            payTransferCreateReqDTO.setChannelExtras( new LinkedHashMap<String, String>( map ) );
        }
        payTransferCreateReqDTO.setType( vo.getType() );
        payTransferCreateReqDTO.setMerchantTransferId( vo.getMerchantTransferId() );
        payTransferCreateReqDTO.setPrice( vo.getPrice() );
        payTransferCreateReqDTO.setSubject( vo.getSubject() );
        payTransferCreateReqDTO.setUserName( vo.getUserName() );
        payTransferCreateReqDTO.setAlipayLogonId( vo.getAlipayLogonId() );
        payTransferCreateReqDTO.setOpenid( vo.getOpenid() );

        return payTransferCreateReqDTO;
    }

    @Override
    public PayTransferCreateReqDTO convert(PayDemoTransferCreateReqVO vo) {
        if ( vo == null ) {
            return null;
        }

        PayTransferCreateReqDTO payTransferCreateReqDTO = new PayTransferCreateReqDTO();

        payTransferCreateReqDTO.setType( vo.getType() );
        payTransferCreateReqDTO.setPrice( vo.getPrice() );
        payTransferCreateReqDTO.setUserName( vo.getUserName() );
        payTransferCreateReqDTO.setAlipayLogonId( vo.getAlipayLogonId() );
        payTransferCreateReqDTO.setOpenid( vo.getOpenid() );

        return payTransferCreateReqDTO;
    }

    @Override
    public PayTransferRespVO convert(PayTransferDO bean) {
        if ( bean == null ) {
            return null;
        }

        PayTransferRespVO payTransferRespVO = new PayTransferRespVO();

        payTransferRespVO.setId( bean.getId() );
        payTransferRespVO.setNo( bean.getNo() );
        payTransferRespVO.setAppId( bean.getAppId() );
        payTransferRespVO.setChannelId( bean.getChannelId() );
        payTransferRespVO.setChannelCode( bean.getChannelCode() );
        payTransferRespVO.setMerchantTransferId( bean.getMerchantTransferId() );
        payTransferRespVO.setType( bean.getType() );
        payTransferRespVO.setStatus( bean.getStatus() );
        payTransferRespVO.setSuccessTime( bean.getSuccessTime() );
        payTransferRespVO.setPrice( bean.getPrice() );
        payTransferRespVO.setSubject( bean.getSubject() );
        payTransferRespVO.setUserName( bean.getUserName() );
        payTransferRespVO.setAlipayLogonId( bean.getAlipayLogonId() );
        payTransferRespVO.setOpenid( bean.getOpenid() );
        payTransferRespVO.setNotifyUrl( bean.getNotifyUrl() );
        payTransferRespVO.setUserIp( bean.getUserIp() );
        Map<String, String> map = bean.getChannelExtras();
        if ( map != null ) {
            payTransferRespVO.setChannelExtras( new LinkedHashMap<String, String>( map ) );
        }
        payTransferRespVO.setChannelTransferNo( bean.getChannelTransferNo() );
        payTransferRespVO.setChannelErrorCode( bean.getChannelErrorCode() );
        payTransferRespVO.setChannelErrorMsg( bean.getChannelErrorMsg() );
        payTransferRespVO.setChannelNotifyData( bean.getChannelNotifyData() );
        payTransferRespVO.setCreateTime( bean.getCreateTime() );

        return payTransferRespVO;
    }

    @Override
    public PageResult<PayTransferPageItemRespVO> convertPage(PageResult<PayTransferDO> pageResult) {
        if ( pageResult == null ) {
            return null;
        }

        PageResult<PayTransferPageItemRespVO> pageResult1 = new PageResult<PayTransferPageItemRespVO>();

        pageResult1.setList( payTransferDOListToPayTransferPageItemRespVOList( pageResult.getList() ) );
        pageResult1.setTotal( pageResult.getTotal() );

        return pageResult1;
    }

    protected PayTransferPageItemRespVO payTransferDOToPayTransferPageItemRespVO(PayTransferDO payTransferDO) {
        if ( payTransferDO == null ) {
            return null;
        }

        PayTransferPageItemRespVO payTransferPageItemRespVO = new PayTransferPageItemRespVO();

        payTransferPageItemRespVO.setId( payTransferDO.getId() );
        payTransferPageItemRespVO.setNo( payTransferDO.getNo() );
        payTransferPageItemRespVO.setAppId( payTransferDO.getAppId() );
        payTransferPageItemRespVO.setChannelId( payTransferDO.getChannelId() );
        payTransferPageItemRespVO.setChannelCode( payTransferDO.getChannelCode() );
        payTransferPageItemRespVO.setMerchantTransferId( payTransferDO.getMerchantTransferId() );
        payTransferPageItemRespVO.setType( payTransferDO.getType() );
        payTransferPageItemRespVO.setStatus( payTransferDO.getStatus() );
        payTransferPageItemRespVO.setSuccessTime( payTransferDO.getSuccessTime() );
        payTransferPageItemRespVO.setPrice( payTransferDO.getPrice() );
        payTransferPageItemRespVO.setSubject( payTransferDO.getSubject() );
        payTransferPageItemRespVO.setUserName( payTransferDO.getUserName() );
        payTransferPageItemRespVO.setAlipayLogonId( payTransferDO.getAlipayLogonId() );
        payTransferPageItemRespVO.setOpenid( payTransferDO.getOpenid() );
        payTransferPageItemRespVO.setChannelTransferNo( payTransferDO.getChannelTransferNo() );
        payTransferPageItemRespVO.setCreateTime( payTransferDO.getCreateTime() );

        return payTransferPageItemRespVO;
    }

    protected List<PayTransferPageItemRespVO> payTransferDOListToPayTransferPageItemRespVOList(List<PayTransferDO> list) {
        if ( list == null ) {
            return null;
        }

        List<PayTransferPageItemRespVO> list1 = new ArrayList<PayTransferPageItemRespVO>( list.size() );
        for ( PayTransferDO payTransferDO : list ) {
            list1.add( payTransferDOToPayTransferPageItemRespVO( payTransferDO ) );
        }

        return list1;
    }
}
