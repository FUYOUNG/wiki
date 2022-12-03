package com.my.wiki.service;

import com.my.wiki.domain.Ebook;
import com.my.wiki.domain.EbookExample;
import com.my.wiki.mapper.EbookMapper;
import com.my.wiki.req.EbookReq;
import com.my.wiki.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebooklist = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList =new ArrayList<>();

        for (Ebook ebook : ebooklist) {
            EbookResp ebookResp=new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            respList.add(ebookResp);
        }
        return respList;
    }
}
