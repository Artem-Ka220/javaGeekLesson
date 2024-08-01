package lesson_16;

/**
 * PresenterOfT
 */
public class PresenterOfT<T extends CalcModel> {
    View view;
    Model model;

    public PresenterOfT(View v, T m) {
        view = v;
        model = m;
    }

    public void Button() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}