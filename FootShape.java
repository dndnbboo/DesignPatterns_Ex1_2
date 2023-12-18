public class FootShape {
    private Foot foot;
    public String drawAsEllipse(){
        return foot.draw();
    }
    public String drawAsRectangle(){
        return foot.draw();
    }
    public FootShape(Foot footShape) {
        this.foot = footShape;
    }
}
