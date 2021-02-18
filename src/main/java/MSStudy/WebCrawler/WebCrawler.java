package MSStudy.WebCrawler;

import java.util.*;



public class WebCrawler implements HtmParser{
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        if(startUrl == null || startUrl.equals("")) return new LinkedList<>();

        String hostName = startUrl.split("/")[2];
        Queue<String> q = new LinkedList<>();
        q.offer(startUrl);

        Set<String> visited = new HashSet<>();
        visited.add(startUrl);

        while(!q.isEmpty()){
            String url = q.poll();
            List<String> urls = htmlParser.getUrls(url);
            for(String u: urls){
                if(u.contains(hostName) && !visited.contains(u)){
                    q.offer(u);
                    visited.add(u);
                }
            }
        }
        return new LinkedList<>(visited);
    }

    @Override
    public List<String> getUrls(String url) {
        return null;
    }
}
