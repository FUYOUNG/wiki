package com.my.wiki.service;

import com.my.wiki.domain.Ebook;
import com.my.wiki.domain.EbookExample;
import com.my.wiki.mapper.EbookMapper;
import com.my.wiki.req.EbookReq;
import com.my.wiki.resp.EbookResp;
import com.my.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample=new EbookExample();
        EbookExample.Criteria criteria=ebookExample.createCriteria();
        if(!ObjectUtils.isEmpty(req.getName())){
        criteria.andNameLike("%"+req.getName()+"%");}
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
//        List<EbookResp> respList =new ArrayList<>();
//        for (Ebook ebook : ebooklist) {
//            EbookResp ebookResp= CopyUtil.copy(ebook,EbookResp.class);
//            respList.add(ebookResp);
//        }
        List<EbookResp> respList = CopyUtil.copyList(ebookList,EbookResp.class);
        return respList;
    }
}
